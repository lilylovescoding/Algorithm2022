package Practice14_HashMap_Implementation;

public class HashMap {
    private Node[]array;

}
class Node{
    private final String key;
    private Integer value;
    Node next;
    Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}