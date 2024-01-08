import unittest

import functions

class TestingFunctions(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        print("instruction run once ")

    def setUp(self):
        print("instructions before each test ")


    def test_add(self):
        self.assertEqual(functions.add(15,35),50)
        self.assertEqual(functions.add(-8,4),-4)

    def test_down(self):
        self.assertEqual(functions.down(20,10),10)
        self.assertEqual(functions.down(-14,10),-24)

    '''def test_multiplication(self):
        self.assertEqual(functions.multiplication(20,10),200)
        self.assertEqual(functions.multiplication(20,2),40)


    def test_division(self):
        self.assertEqual(functions.division(20,10),2)
        self.assertEqual(functions.division(27,-3),-9)
    '''
    def tearDown(self):
        print("instructions for the final steps ")

    @classmethod
    def tearDownClass(cls):
        print("instruction run once, at the end ")


