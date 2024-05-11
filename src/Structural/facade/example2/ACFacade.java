package Structural.facade.example2;

public class ACFacade {
    ACExternalUnit acExternalUnit;
    ACInternalUnit acInternalUnit;

    public ACFacade(ACExternalUnit acExternalUnit, ACInternalUnit acInternalUnit) {
        this.acExternalUnit = acExternalUnit;
        this.acInternalUnit = acInternalUnit;
    }

    void turnOnButtonClicked(){
        acInternalUnit.acceptUserTempCmd();;
        acExternalUnit.checkVoltage();
        acExternalUnit.consumeNitrogen();
        acExternalUnit.startCondensor();
    }
}
