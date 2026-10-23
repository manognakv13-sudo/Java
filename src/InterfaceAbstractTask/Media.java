package InterfaceAbstractTask;

public abstract class Media {
    String title = "India Today News";
    void displayTitle(){
        System.out.println("current playing video is : "+title);
    }

    abstract void TitleChange(String title);
}
