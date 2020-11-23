package composition;

public class Processor {

    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;


    public Processor(){
        this.brand = "intel";
        this.series = "7200u";
        this.generation = 7;
        this.cores = 2;
        this.threads = 4;
        this.cacheMemory = "3 MB";
        this.frequency = "2.5 Ghz";
        this.MinFrequency = "2.5 Ghz";
        MaxFrequency = "3.1 Ghz";

    }
    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.MinFrequency = minFrequency;
        this.MaxFrequency = maxFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return MinFrequency;
    }

    public String getMaxFrequency() {
        return MaxFrequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", MinFrequency='" + MinFrequency + '\'' +
                ", MaxFrequency='" + MaxFrequency + '\'' +
                '}';
    }
}
