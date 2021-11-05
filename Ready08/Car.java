public class Car {
  // 燃料(Km/L)
  private double fuelCost;
  // 残量(L)
  private double fuelAmount;

  // コンストラクタを作成
  public Car(double cost, double amount) {
    this.fuelCost = cost;
    this.fuelAmount = amount;
  }

  public void move(int mileage) {
    System.out.println(mileage + "Km 走ります");
    this.fuelAmount -= (mileage / fuelCost);
  }

  public double getFuelAmount() {
    return this.fuelAmount;
  }
}