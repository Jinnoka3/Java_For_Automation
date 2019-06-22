package inheritance.inheritance2;

public enum Color {

    BLACK ("black"),
    WHITE ("white"),
    YELLOW ("yellow"),
    RED ("red"),
    BLUE ("blue"),
    GREEN ("green");

    private String color;

    Color(String color){
        this.color = color;
    }

    public static boolean checkColor (String str){
        for (Color c : Color.values()) {
            if (c.name().equals(str.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

}
