package net.rabhi;

public class AdapteteurPourStandard implements Standard{
    private HDMI hdmi;
    @Override
    public void operation(String message) {
        System.out.println("l'utilisation de l'adaptateur");
        byte[] data = message.getBytes();
        hdmi.view(data);
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
