package GENERICS;

//це універсальний клас дженерік для роботи з будь-яким типом даних
public class Generics<Т> {            //сюди замість Т ми можемо передати будь-який тип даних
    private String string = "";

    public String getString() {
        return string;
    }

    public <Т> void addToString(Т t) {   //Т - тип даних, т - название
        if (this.string.equals("")) {
            this.string = this.string + t.toString();
        } else {
            this.string = this.string + " - " + t.toString();
        }
    }
}
