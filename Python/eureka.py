
def sum_dig_pow(a, b):

    eureka_list = []

    for i in range(a, b + 1):

        aux_str = str(i)
        sum_acum = 0
        power_counter = 0

        for digit in aux_str:
            power_counter += 1
            sum_acum += int(digit) ** power_counter

        if sum_acum == int(aux_str):
            eureka_list.append(int(aux_str))

    return eureka_list



if __name__ == "__main__":
    print(sum_dig_pow(1, 100))