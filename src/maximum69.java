public int maximum69Number(int num) {
    int temp = num;
    int place = 1;
    int add = 0;

    while (temp > 0) {
        if (temp % 10 == 6) {
            add = 3 * place;
        }
        temp /= 10;
        place *= 10;
    }

    return num + add;
}
}