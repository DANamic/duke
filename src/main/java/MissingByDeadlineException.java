class MissingByDeadlineException extends DukeException {

    @Override
    public String toString() {
        return "☹ OOPS!!! Remember to use \"/by\" for Deadlines.";
    }
}
