// 24 Write a C program to shift an element in left direction and return a new array.



class jan_25_assignment_24{
public static void main(String[] args) {
    int n = arr.length;
    int temp = arr[0];
    for (int i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp;
    return arr;
}
}
