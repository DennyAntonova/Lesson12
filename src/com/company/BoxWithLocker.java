package com.company;

public class BoxWithLocker extends Box implements LockAndUnLock{
   String lockerType;
   String lockerStatus;

    public BoxWithLocker(Object color, String lockerType, String lockerStatus) {
        super(color);
        this.lockerType = lockerType;
        this.lockerStatus = lockerStatus;
    }

    @Override
    public void lock() {
        System.out.println("The box is lock");
    }

    @Override
    public void unlock() {
        System.out.println("The box is unlock");
    }
}
