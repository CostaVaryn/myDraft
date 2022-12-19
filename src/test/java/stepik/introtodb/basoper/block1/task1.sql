-- Выведите поступления денег от пользователя с email 'vasya@mail.com'.

SELECT * FROM billing WHERE payer_email='vasya@mail.com'

/*
Query result:
+----------------+-----------------+--------+----------+--------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| payer_email    | recipient_email | sum    | currency | billing_date | comment                                                                                                                                                                                                    |
+----------------+-----------------+--------+----------+--------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| vasya@mail.com | petya@mail.com  | 910.00 | INR      | 2015-01-23   | I haven't seen any statuses about Ninjas lately....well played Ninjas.                                                                                                                                     |
| vasya@mail.com | ivan@mail.com   | 179.00 | MYR      | 2015-05-29   | Light travels faster then sound. This is why some people appear bright ,until you hear them talk.                                                                                                          |
| vasya@mail.com | bobby@mail.com  | 610.00 | GBP      | 2015-02-27   | I speak my mind. I never mind what I speak.                                                                                                                                                                |
| vasya@mail.com | lenny@mail.com  | 249.00 | CAD      | 2015-07-21   | I do 5 sit-ups every morning. May not sound like much, but there is only so many times you can hit the snooze button...'                                                                                   |
| vasya@mail.com | alex@mail.com   | 676.00 | AUD      | 2015-08-08   | I was planning to do something today, but I haven't finished doing nothing from yesterday.                                                                                                                 |
| vasya@mail.com | john@mail.com   | 909.00 | EUR      | 2015-02-21   | No I didn't trip, the floor looked like it needed a hug.                                                                                                                                                   |
| vasya@mail.com | leo@mail.com    | 696.00 | CAD      | 2015-05-10   | I love how, in horror movies, the person yells out,Hello? As if the bad is going to yell back, Yeah, I'm in the kitchen! Do you want a sandwich? Or,Hey, yeah I'm back here with a chainsaw. Come on down. |
| vasya@mail.com | enzo@mail.com   | 996.00 | GBP      | 2015-08-27   | I changed all my passwords to 'incorrect'. So my computer just tells me when I forgot.                                                                                                                     |
| vasya@mail.com | franz@mail.com  | 525.00 | JPY      | 2015-03-14   | Procrastinator? No, I just wait until the last second to do my work because I will be older, therefore wiser.                                                                                              |
| vasya@mail.com | petya@mail.com  | 212.00 | CAD      | 2015-07-10   | I speak my mind. I never mind what I speak.                                                                                                                                                                |
+----------------+-----------------+--------+----------+--------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
Affected rows: 10
*/