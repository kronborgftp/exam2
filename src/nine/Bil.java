package nine;

public class Bil {

    private int weight;
    private Trailer trailer;

    public Bil(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void tilkobTrailer() {
        //calc weight if trailer is added
        int samletWeight = this.weight + (trailer != null ? trailer.getWeight() : 0);

        if(samletWeight <= 3500) {
            this.trailer = trailer;
        } else {
            System.out.println("too heavy like your mom");
        }
    }

    public int getTotalWeight() {
        return this.weight + (this.trailer != null ? this.trailer.getWeight(): 0);
    }
}
