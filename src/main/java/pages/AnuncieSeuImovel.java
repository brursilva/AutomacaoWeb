package pages;


import org.junit.Assert;
import support.Setup;


public class AnuncieSeuImovel  {

    private Setup driver;

    public AnuncieSeuImovel(support.Setup stepDriver) {
        driver = stepDriver;
    }

    public void abrirPortal() {
        driver.openURL(System.getProperty("url"));
    }

    public void verificarURL(String value) throws InterruptedException {
        String currentURL = driver.getCurrentUrl();
        System.out.println("A página aberta é: " + currentURL);
        Assert.assertTrue(currentURL.contains(value));
    }
    public void verificarHomePage() throws InterruptedException {
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("dev")) {
            Assert.assertTrue(currentURL.contains("devfrontportaltqi.lpsbr.com/"));
        }
        if (currentURL.contains("qa")) {
            Assert.assertTrue(currentURL.contains("qafrontportal.lpsbr.com/"));
        }
    }

    public void clicarAnuncieSeuImovel() {
        driver.click("logo_menu_header-Anuncie seu Imóvel", "id");
    }

    public void informarNome(String value) { driver.sendKeys(value, "name"); }

    public void informarEmail(String value) { driver.sendKeys(value, "email"); }

    public void informarTelefone(String value) { driver.sendKeys(value, "phone"); }

    public void clicarOpcao(String value){
        switch (value) {
            case "Vender":
                driver.forceClick("//*[@id=\"SALE\"]/span", "xpath");
                break;
            case "Alugar":
                driver.forceClick("//*[@id=\"RENT\"]/span", "xpath");
                break;
        }
}

   /* public void selecionarImovel(String value) {
            switch (value) {
                        case "Apartamento":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Casa":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                   /*     case "Comercial":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Hotel":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Galpão":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Loteamento":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Terreno":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
                        case "Terreno Rural":
                            driver.forceClick("//*[@id=\"type\"]", "type");
                            break;
            }
    }*/

    public void informarCEP(String value) { driver.sendKeys(value, "postalCode"); }

   // public void informarEndereco(String value) { driver.sendKeys(value,"Endereço"); }

    public void informarNumEndereco(String value) { driver.sendKeys(value, "number"); }

    public void informarBairro(String value) { driver.sendKeys(value, "neighbourhood"); }

    public void informarEstado(String value) { driver.sendKeys(value, "state"); }

    //public void informarCidade(String value) { driver.sendKeys(value, "cidade")}

    public void clicarBtnEnviar(){
        driver.forceClick("/html/body/app-root/div/owner-home/owner-new-advertise/div/div/section[2]/owner-advertise-form/form/button", "xpath");
    }


}
