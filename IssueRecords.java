package LibraryManagementSystem;
import java.time.LocalDate;

public class IssueRecords {
    private final int recordId;
    private final int bookId;
    private final int memberId;
    private final LocalDate issueDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;   // null = still issued
    private long fine;

    public IssueRecords(int recordId, int bookId, int memberId, LocalDate issueDate, LocalDate dueDate) {
        this.recordId = recordId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public int getRecordId()        {
        return recordId;
    }

    public int getBookId()          {
        return bookId;
    }

    public int getMemberId()        {
        return memberId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate()   {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public long getFine()           {
        return fine;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public void markReturned(LocalDate returnDate, long fine) {
        this.returnDate = returnDate;
        this.fine = fine;
    }
}