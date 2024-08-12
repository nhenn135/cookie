import random 
 
with open("easytorememberlist.txt") as file: 
    words = file.readlines() 
 
random_list = random.sample(words, 4)
 

random_list = [word.strip() for word in random_list] 
 
print(random_list)