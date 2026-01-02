from phi.agent import Agent
from phi.model.groq import Groq
from dotenv import load_dotenv
from phi.tools.yfinance import YFinanceTools

load_dotenv()

agent = Agent(
    model=Groq(id="qwen/qwen3-32b"),
    tools=[YFinanceTools(stock_price=True, analyst_recommendations=True, stock_fundamentals=True)],
    show_tool_calls=True,
    markdown=True,
    instructions=["Use tables to display data"]
)

#agent.print_response("Summarize and compare analyst recommendations and fundamentals " \
#                     "for stocks of SUZLON.NS and POWERGRID.NS of Indian Stock market.")
#agent.print_response("Compare the current stock prices for SUZLON.NS and POWERGRID.NS")
agent.print_response("I am having 30 shares of SUZLON.NS and 80 shares of POWERGRID.NS"\
                     "What is my total value currently?")
