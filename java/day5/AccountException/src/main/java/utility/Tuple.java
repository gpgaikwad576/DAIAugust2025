package utility;

public class Tuple<A, B> {
    public Response rp;
    public Response rp2;
    public Tuple(){
        this.rp = new Response();
        this.rp2 = new Response();
    };
    public Tuple(Response rp, Response rp2) {
        this.rp = rp;
        this.rp2 = rp2;
    }
}

