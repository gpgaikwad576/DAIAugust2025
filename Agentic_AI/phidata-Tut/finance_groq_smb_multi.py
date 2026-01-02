from phi.agent import Agent
from phi.model.groq import Groq
from dotenv import load_dotenv
from phi.tools.duckduckgo import DuckDuckGo
from phi.tools.yfinance import YFinanceTools

load_dotenv()


def get_company_symbol(company: str) -> str:
    """Use this function to get the symbol for a company.

    Args:
        company (str): The name of the company.

    Returns:
        str: The symbol for the company.
    """
    symbols = {
        "Suzlon": "SUZLON.NS",
        "Power Grid": "POWERGRID.NS",
        "Exide": "EXIDEIND.NS",
        "Tata Motors Passenger": "TMCV.NS",
        "Tata Motors": "TMCV.NS",
        "Kirloskar": "KIRLPNU.NS",
        "Adani Green Energy": "ADANIGREEN.NS",
    }
    try:
        mysym = symbols[company]
    except KeyError:
        mysym = "Unknown"
    
    return mysym


    #return symbols.get(company, "Unknown")

web_agent = Agent(
    name="Web Agent",
    # model=Groq(id="llama-3.3-70b-versatile"),
    model=Groq(id="qwen/qwen3-32b"),
    tools=[DuckDuckGo()],
    instructions=["Always include sources"],
    show_tool_calls=True,
    markdown=True
)

fin_agent = Agent(
    model=Groq(id="qwen/qwen3-32b"),
    tools=[YFinanceTools(stock_price=True, analyst_recommendations=True, stock_fundamentals=True)],
    show_tool_calls=True,
    markdown=True,
    instructions=["Use tables to display data",
                  "If you need to find the symbol for a company, use the get_company_symbol tool."]
)


agent_team = Agent(
    # model=Groq(id="llama-3.3-70b-versatile"),
    model=Groq(id="qwen/qwen3-32b"),
    team=[web_agent, fin_agent],
    instructions=["Always include sources", "Use tables to display data"],
    show_tool_calls=True,
    markdown=True,
)

agent_team.print_response("Summarize and compare analyst recommendations and fundamentals " \
                     "for stocks of Exide and Suzlon of Indian Stock market.")