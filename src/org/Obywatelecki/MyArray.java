package org.Obywatelecki;
public class MyArray<T> {

    public int size;
    private int resizeValue;
    private T[] data;

    public void setResizeValue(int resizeValue) {
        this.resizeValue = resizeValue;
    }

    public MyArray() {
        this.size = 0;
        this.resizeValue = 4;
        this.data = (T[]) new Object[resizeValue];
    }

    private void checkSize() {
        if (size == data.length) {
            resize(size + resizeValue);
        }
    }

    public void resize(int newLength) {
        T[] newData = (T[]) new Object[newLength];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public void insert(int idx, T inData) {
        checkSize();
        System.arraycopy(data, idx, data, idx + 1, size - idx);
        data[idx] = inData;
        ++this.size;
    }

    public T getData(int idx) {
        return data[idx];
    }

    public void append(T inData) {
        checkSize();
        data[size] = inData;
        ++this.size;
    }

    public void delete(int idx) {
        System.arraycopy(data, idx + 1, data, idx, size - idx);
        --this.size;
    }

}
