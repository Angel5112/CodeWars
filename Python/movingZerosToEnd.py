"""
Write an algorithm that takes an array and moves all of the zeros to the end,
preserving the order of the other elements.
"""

def move_zeros(lst):
    
    aux_list = []
    non_zero_counter = 0

    for i in range(0, len(lst)):
        if lst[i] == 0:
            aux_list.append(0)
        else:
            aux_list.insert(non_zero_counter, lst[i])
            non_zero_counter += 1

    return aux_list



if __name__ == "__main__":
    test_list = move_zeros([1, 0, 1, 2, 0, 1, 3])
    print(test_list)