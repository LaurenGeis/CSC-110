package CSC110;
public class userInfo implements Comparable<userInfo>{
    
    public  String names;
    public  String addresses;
    public  String phones;

    public int compareTo(userInfo other) {
        return names.compareToIgnoreCase(other.names);
        
    }

    public boolean equals(userInfo other) {
        return names.equalsIgnoreCase(other.names);
    }




}
