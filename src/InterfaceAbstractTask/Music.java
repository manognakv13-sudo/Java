package InterfaceAbstractTask;

public class Music extends Media implements playable, Flying{

    @Override
    public void play() {
        System.out.println("the basketBall can we play");
    }

    @Override
    public void sport() {
        System.out.println("the iceHockey can we fly");
    }

    @Override
    void TitleChange(String title) {
        System.out.println("the title change is "+ title);

    }
}
