"""
Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
"""

def delete_nth(order, max_e):

    new_list = []

    for element in order:
        
        if new_list.count(element) < max_e:
            new_list.append(element)

    return new_list


if __name__ == "__main__":
    print(delete_nth([20,37,20,21], 1))