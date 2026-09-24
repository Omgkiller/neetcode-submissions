class Solution {
    record Car(int position, int speed){};
    public int carFleet(int target, int[] position, int[] speed) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i<position.length; i++){
            list.add(new Car(position[i], speed[i]));
        }
        Collections.sort(list, new Comparator<Car>(){
            public int compare(Car o1, Car o2){
                return o2.position() - o1.position();
            }
        });
        Stack<Double> cars = new Stack<>();
        for (Car car : list){
            double timeCar = (target-car.position())/ (double) car.speed();
            //System.out.println(timeCar);
            if (cars.size() == 0 || timeCar > cars.peek()){
                cars.push(timeCar);
            }
        }
        return cars.size();
        
    }
}
