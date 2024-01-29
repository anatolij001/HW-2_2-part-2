public abstract class WheeledTransport implements Transport{
    private String modelName;
    private int wheelsCount;
    public WheeledTransport(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}