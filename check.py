with open("hello.txt", 'a') as f:
    for i in range(100000):
        f.write("Hi"*i)
