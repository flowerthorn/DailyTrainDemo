package com.study.algorithm;

public class ParkingSystem {

    private int mBigCount;

    private int mMediumCount;

    private int mSmallCount;

    public ParkingSystem(int big, int medium, int small) {
        mBigCount = big;
        mMediumCount = medium;
        mSmallCount = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (mBigCount > 0) {
                    mBigCount--;
                    return true;
                }
                break;
            case 2:
                if (mMediumCount > 0) {
                    mMediumCount--;
                    return true;
                }
                break;
            case 3:
                if (mSmallCount > 0) {
                    mSmallCount--;
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }
}
