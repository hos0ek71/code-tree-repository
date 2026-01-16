product_name, product_code = input().split()
product_code = int(product_code)

# Please write your code here.

class product:
    def __init__(self, name = "codetree", code = 50):
        self.n = name
        self.c = code

productOne = product()
productTwo = product(product_name, product_code)

print(f"product {productOne.c} is {productOne.n}")
print(f"product {productTwo.c} is {productTwo.n}")