import random

# creates 5 unique elements from 1..50 and adds a + and a [0-19]+1 number
randlist = random.sample(range(1,54),k=6) + ["+", random.choice(range(26))+1]
print(randlist)

print("You drew {} {} {} {} {} {} {}".format(*randlist))