package Beginner.nasledovanie.hw1;

public abstract class DocumentWorker {

private int count;

    public DocumentWorker() {
        System.out.println("constructor");
    }
    public DocumentWorker(int count) {

        this.count = count;
    }





    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public  void getC(){
        System.out.println("Document");
    };


    public void openDocument(){
        System.out.println("Документ открыт");
    }
    public void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }
    public void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");

    }
}
