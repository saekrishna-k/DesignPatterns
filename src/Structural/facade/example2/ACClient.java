package Structural.facade.example2;

public class ACClient {
    public static void main(String[] args){
        ACFacade acFacade = new ACFacade(new ACExternalUnit(), new ACInternalUnit());
        acFacade.turnOnButtonClicked();
    }
}
