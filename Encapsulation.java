class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.__balance = balance  
        self.__transactions = []  

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            self.__transactions.append(f"Deposited: {amount}")
        else:
            print("Deposit amount must be positive!")

    def withdraw(self, amount):
        if amount <= self.__balance:
            self.__balance -= amount
            self.__transactions.append(f"Withdrew: {amount}")
        else:
            print("Insufficient balance!")

    def get_balance(self):
        return self.__balance

    def show_transactions(self):
        print(f"Transaction History for {self.owner}:")
        for t in self.__transactions:
            print(t)

account = BankAccount("Alice", 1000)
account.deposit(500)
account.withdraw(200)
account.withdraw(2000) 
print("Current Balance:", account.get_balance())
account.show_transactions()
