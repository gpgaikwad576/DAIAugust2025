public interface SerializeToDB {
    void saveToDB();
    default void test(){
        System.out.println("In DB");
    }
}
