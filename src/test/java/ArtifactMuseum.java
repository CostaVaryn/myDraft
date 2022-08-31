public class ArtifactMuseum {

    int number;
    String culture;
    int age;
    public int count;

    public ArtifactMuseum() {
        this.number = 1001;
        count++;
    }

    public ArtifactMuseum(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public ArtifactMuseum(int number, String culture, int age) {
        this.number = number;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {
        ArtifactMuseum firstArt = new ArtifactMuseum();
        ArtifactMuseum secondArt = new ArtifactMuseum(1000, "Aztecs");
        ArtifactMuseum thirdArt = new ArtifactMuseum(1002, "Aztecs", 12);
        System.out.println("Порядковый номер: " + firstArt.number + ", в количестве: " + firstArt.count);
        System.out.println("Порядковый номер: " + secondArt.number + ", культура: " + secondArt.culture);
        System.out.println("Порядковый номер: " + thirdArt.number + ", культура: " + thirdArt.culture + ", век: " + thirdArt.age);
    }
}
