# Core-controller
a pc core controller in java

## Usage:
```Java
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
```
