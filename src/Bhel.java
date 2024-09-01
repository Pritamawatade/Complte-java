public class Bhel
{
    String mvp;
    String souse;
    String taste;
    String mood;

    Bhel(String mvp, String souce, String taste, String mood)
    {
        this.mvp = mvp;
        this.souse = souce;
        this.taste = taste;
        this.mood = mood;

    }
    Bhel(String mvp, String mood)
    {
        this.mvp = mvp;
        this.mood =  mood;

    }
    Bhel(String mvp)
    {
        this.mvp = mvp;
    }

    public String toString(){
        return "Bhel is made with"+mvp+souse+taste+mood;
    }
}
