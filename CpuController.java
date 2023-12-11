public class CpuController {

    private int maxCores;

    public CpuController() {
        this.maxCores = Runtime.getRuntime().availableProcessors();
    }

    public int getMaxCores() {
        return maxCores;
    }

    public void setMaxCores(int maxCores) {
        if (maxCores >= 0) {
            this.maxCores = Math.min(maxCores, Runtime.getRuntime().availableProcessors());
        } else {
            System.out.println("Negatif bir değer giremezsiniz.");
        }
    }

    public int getCurrentCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    public void increaseCores() {
        if (maxCores < Runtime.getRuntime().availableProcessors()) {
            maxCores++;
            System.out.println("Çekirdek sayısı artırıldı: " + maxCores);
        } else {
            System.out.println("Maksimum çekirdek sayısına ulaşıldı: " + maxCores);
        }
    }

    public void decreaseCores() {
        if (maxCores > 0) {
            maxCores--;
            System.out.println("Çekirdek sayısı azaltıldı: " + maxCores);
        } else {
            System.out.println("Çekirdek sayısı zaten minimumda: " + maxCores);
        }
    }

    public static void main(String[] args) {
        CpuController cpuController = new CpuController();

        System.out.println("Maksimum Çekirdek Sayısı: " + cpuController.getMaxCores());
        System.out.println("Şuanki Çekirdek Sayısı: " + cpuController.getCurrentCores());

        cpuController.increaseCores();
        cpuController.increaseCores();
        cpuController.decreaseCores();
        cpuController.setMaxCores(3);

        System.out.println("Güncellenen Maksimum Çekirdek Sayısı: " + cpuController.getMaxCores());
    }
}
