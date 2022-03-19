package hw6.task1.climber;

public class Climber {
    private String name;
    private String adress;

    public Climber (String name, String adress) {
        setNameAdress(name, adress);
    }

    private void setNameAdress (String name, String adress) {
        if (name.length() < 3 && adress.length() < 5 ) {
            throw new IllegalArgumentException("Ошибка длинны данных");
        }
        this.name = name;
        this.adress = adress;
    }

    public String getNameAdress () {
        return name + " " + adress;
    }

}
