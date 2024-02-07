with open("hello.txt", 'w') as f:
    for i in range(100000):
        f.write("Hi"*i)
