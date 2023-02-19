# https://exercism.org/tracks/python/exercises/guidos-gorgeous-lasagna

EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2


def bake_time_remaining(elapsed_bake_time: int) -> int:
    """Calculate the bake time remaining.

    :param: elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers: int) -> int:
    """Calculate the preparation time based on the number of layers.

        :param: number_of_layers: int - intended number of layers.
        :return: int - total preparation time in minutes

        Function that takes the intended number of layers of the lasagna, and, based on the
        `PREPARATION_TIME` constant, returns the total amount of time (minutes) to
        prepare the lasagna
        """
    return PREPARATION_TIME * number_of_layers


def elapsed_time_in_minutes(number_of_layers: int, elapsed_bake_time: int) -> int:
    """Calculate the elapsed time of the recipe based on the preparation and baking time.

            :param: number_of_layers: int - intended number of layers.
            :param: elapsed_bake_time: int - baking time already elapsed.
            :return: int - total elapsed time

            Function that takes the intended number of layers of the lasagna and elapsed bake time
            and returns the total elapsed time of the recipe
            """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
