public interface SerializeToFile {
    void saveToFile();
    default void test(){
        System.out.println("In File");
    }
}
