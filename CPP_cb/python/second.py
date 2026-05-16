# import firstfile as a
# a.chai("\nThink u got it already!!")
import pprint

data = {
    'name': 'Alice',
    'age': 30,
    'address': {
        'street': '123 Main St',
        'city': 'Wonderland',
        'postal_code': '12345'
    },
    'hobbies': ['reading', 'cycling', 'painting'],
    'friends': [
        {'name': 'Bob', 'age': 25},
        {'name': 'Charlie', 'age': 35}
    ]
}

pprint.pprint(data)
