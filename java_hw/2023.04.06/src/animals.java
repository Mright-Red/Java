class animals {
    void CanCry(){};
}
class dog extends animals{
    void CanCry(){
        System.out.println("我是狗，狗的声音是：wang~wang~wang~");
    };
}
class cat extends animals{
    void CanCry(){
        System.out.println("我是猫，猫的声音是：miao~miao~miao~");
    };
}

