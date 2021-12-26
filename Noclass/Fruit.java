package Noclass;

public enum Fruit {

//	APPLE, ORANGE, PEACH;
	
	APPLE("りんご", 1),
    ORANGE("オレンジ", 2),
    PEACH("もも", 3);

    private String label;
    private int id;


    private Fruit(String label, int id) { 
        this.label = label;
        this.id = id;
    }


    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }
}
