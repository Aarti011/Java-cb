# print("Hello World!")
# def chai(n):
#     print(n)
# chai("Get the chai!")
# chai("\n Now time for coffeeeee")
# chai("\n masala chaska")
# chai( "\n cold coffee")

with open("C:\\Users\\HP\\Desktop\\coding ding ding\\CPP_cb\\python\\python\\file1.txt", "r") as f1:
   with open("C:\\Users\\HP\\Desktop\\coding ding ding\\CPP_cb\\python\\python\\file2.txt", "w+") as f2:
        for line in f1:
            length=str(len(line))
            wt=f2.write(line+length+"\n")
        f2.seek(0)
        file=f2.read()
        print(file) 
    




