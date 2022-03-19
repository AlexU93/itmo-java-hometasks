package hw6.task1.mount;

public class Mount {
    String mountName;
    String country;
    int high;

    public Mount(String mountName, String country, int high) {
        setMountName(mountName);
        setCountry(country);
        setHigh(high);
    }

    private void setMountName(String mountName) {
        if (mountName.length() < 4) {
            throw new IllegalArgumentException("Название горы слишком короткое");
        }
        this.mountName = mountName;
    }

    private void setCountry(String country) {
        if (country.length() < 4) {
            throw new IllegalArgumentException("Название страны слишком короткое");
        }
        this.country = country;

    }

    private void setHigh (int high) {
        if (high < 100) {
            throw new IllegalArgumentException("Это не гора - это холм");
        }
        this.high = high;
    }
}

