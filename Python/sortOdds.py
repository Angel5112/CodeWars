"""
You will be given an array of numbers.
You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
"""

def find_odds(source_array):
    odd_arr = []
    odd_index_arr = []
    new_arr = []

    for i in range(0, len(source_array)):
        if source_array[i] % 2 != 0:
            odd_arr.append(source_array[i])
            odd_index_arr.append(i)
            
        new_arr.append(source_array[i])

    odd_arr.sort()
    return odd_arr, odd_index_arr, new_arr



def sort_array(source_array):

    odd_arr, odd_index_arr, new_arr = find_odds(source_array)
    
    for i in range(0, len(odd_arr)):
        new_arr[odd_index_arr[i]] = odd_arr[i]

    return new_arr



if __name__ == "__main__":
    print(sort_array([5, 8, 6, 3, 4]))