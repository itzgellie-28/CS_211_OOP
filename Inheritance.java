class Vehicle:
    def __init__(self, brand):
        self.brand = brand

    def start(self):
        print("Vehicle is starting...")


class Car(Vehicle):
    def __init__(self, brand, model, owner_name, doors, fuel_capacity, color, is_electric):
        super().__init__(brand)
        self.model = model
        self.owner_name = owner_name
        self.doors = doors
        self.fuel_capacity = fuel_capacity
        self.color = color
        self.is_electric = is_electric

    def display_info(self):
        print(f"Brand: {self.brand}")
        print(f"Model: {self.model}")
        print(f"Owner: {self.owner_name}")
        print(f"Doors: {self.doors}")
        print(f"Fuel Capacity: {self.fuel_capacity} liters")
        print(f"Color: {self.color}")
        print(f"Electric: {'Yes' if self.is_electric else 'No'}")


# Example usage
my_car = Car("Tesla", "Model S", "Angel Fhey Cataros", 4, 100, "White", True)
my_car.start()
my_car.display_info()
