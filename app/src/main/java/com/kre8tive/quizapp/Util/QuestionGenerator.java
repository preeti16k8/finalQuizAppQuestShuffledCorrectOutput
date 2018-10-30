package com.kre8tive.quizapp.Util;

import com.kre8tive.quizapp.Database.Questions;

/**
 * Created by Ashet on 04-11-2017.
 */

public class QuestionGenerator {

    public static void generate(){



    }
    public static void createQuestion(int id,String ques,String correct,String wrong1,String wrong2,String wrong3){
        final Questions questions=new Questions();
        questions.setId(id);
        questions.setQuestion(ques);
        questions.setCorrect(correct);
        questions.setWrong1(wrong1);
        questions.setWrong2(wrong2);
        questions.setWrong3(wrong3);
        QuizApp.getDaoSession().getQuestionsDao().insert(questions);

    }
    public static void generateQuestions(){

        QuestionGenerator.createQuestion(1,"An “Aha Moment” in corporate speak is the moment when you","Discover something important",
                "whenever possible",
                "Leave office early",
                "You win a quiz on 80s Pop"
        );
        QuestionGenerator.createQuestion(2, "“Force to be Reckoned with” is sometimes referred to as",
                "An 800 pound Gorilla",
                "A Titanic Rhino",
                "A Strutting Emu",
                "A Muscular Labrador"
        );
        QuestionGenerator.createQuestion(3,

                                "When your boss wants something “ASAP” he wants it",
                "Right now",
                "Tomorrow",
                "Any time possible",
                "This Week"
        );
        QuestionGenerator.createQuestion(4,"If someone tells you they don’t have the “Bandwidth” they mean ",
                "They don’t have the time and resources",
                "They don’t have internet ",
                "They missed lunch",
                "They have turned vegan"
        );
        QuestionGenerator.createQuestion(5,
                        "Something that gives you “Bang for the Buck” gives you",
                "A great return on investment",
                "An atrocious right swing",
                "A horrible hangover",
                "A terrible migraine"
        );


        QuestionGenerator.createQuestion(6,"“Brick and Mortar” establishment is another term for","Any physical business",
                "A dentist’s clinic",
                "An after-office game",
                "Do it yourself furniture"
        );
        QuestionGenerator.createQuestion(7, "When some one asks you what you “Bring to the Table” you talk about",
                "Your work experiences",
                "Your lunch",
                "Your Poker Game",
                "Your interior decoration"
        );
        QuestionGenerator.createQuestion(8,

                "If you have a “Buy-in” from your team you have got",
                "Their agreement",
                "An all-expenses paid trip",
                "A tip on the stock market",
                "A deep discount voucher"
        );
        QuestionGenerator.createQuestion(9,"When you are nominated as the “Champion” for something, you are",
                "The person responsible for something",
                "The winner of an office bet ",
                "The most attractive colleague around",
                "The person who buys drinks for everyone"
        );
        QuestionGenerator.createQuestion(10,
                "A “Change Agent” is someone who",
                "Brings around drastic changes",
                "Works at a toll booth",
                "Hires new agents",
                "Exchanges currency"
        );

        QuestionGenerator.createQuestion(11,"A company’s “Core Competency” is what the company","Does very well",
                "Tried once but failed",
                "Does terribly",
                "Wishes it was"
        );
        QuestionGenerator.createQuestion(12, "“Cross-Training” is a/an",
                "Training program in another domain",
                "Work out at Cross-Fit",
                "Anger management program",
                "Handwriting technique"
        );
        QuestionGenerator.createQuestion(13,

                "When a product is “Cutting Edge” it has",
                "Ground breaking features",
                "Very sharp edges",
                "Flat performance",
                "Scintillating sales"
        );
        QuestionGenerator.createQuestion(14,"If you have been asked to “Deep Dive” you ",
                "Analyze thoroughly",
                "Get ready for a SCUBA lesson",
                "Look for a bar",
                "Go scarce"
        );
        QuestionGenerator.createQuestion(15,
                "You have a “Disconnect” with your boss when",
                "You have a misunderstanding",
                "Your phone line goes blank",
                "Your connecting flight is delayed",
                "He appreciates your disco moves"
        );

        QuestionGenerator.createQuestion(16,"“Empowering” an employee connotes","Giving him greater responsibility",
                "Sending him for weight training",
                "Hiring him a dietician",
                "Gifting him a power drill"
        );
        QuestionGenerator.createQuestion(17, "A “Game Changer” is someone who",
                "Brings significant change",
                "Likes football but not cricket",
                "Likes hunting",
                "Exchanges currency with a smile"
        );
        QuestionGenerator.createQuestion(18,

                "“Going Forward” is a corporate way of talking about",
                "Future plans",
                "Football strategy",
                "Stock market investment",
                "Time management"
        );
        QuestionGenerator.createQuestion(19,"When you “Get Everyone On Board” you have",
                "Everyone’s agreement",
                "Clearance to take off",
                "A very full lifeboat",
                "A cardboard zoo"
        );
        QuestionGenerator.createQuestion(20,
                "If something is “Good to Go” it is",
                "Approved by the client",
                "Ready for a trip to China",
                "Of noble character",
                "Not great yet"
        );
        QuestionGenerator.createQuestion(21,"When you “Grew the Business” you","Increased sales",
                "Grew a beard",
                "Cultivated plants",
                "Hired consultants"
        );
        QuestionGenerator.createQuestion(22, "A “Rough Estimate” is often called",
                "A Guesstimate",
                "A twist of fate",
                "An apartment mate",
                "A Real mate"
        );
        QuestionGenerator.createQuestion(23,

                "If you are invented for an “Ideation” you get to",
                "Brainstorm",
                "Meditate",
                "Party hard",
                "Go home early"
        );
        QuestionGenerator.createQuestion(24,"If you have been “Incentivized” you should be feeling",
                "Motivated",
                "Tired",
                "Hungry",
                "Thirsty"
        );
        QuestionGenerator.createQuestion(25,
                "A “Key Takeaway” is",
                "An important point",
                "A delicious pizza",
                "A locked door",
                "A safety vault"
        );

        QuestionGenerator.createQuestion(26,"When asked what have been your “Learnings” you talk about","The lessons learnt",
                "Your political leanings",
                "Your domestic pets",
                "Your life’s earnings in French"
        );
        QuestionGenerator.createQuestion(27, "A “Level Playing Field” is a way of talking about ",
                "A fair competition",
                "A well-maintained football ground",
                "A playground with swings",
                "A cricket pitch"
        );
        QuestionGenerator.createQuestion(28,

                "What’s a “Magic Bullet”?",
                "Something that solves all problems",
                "A Kryptonite Weapon",
                "Something that kills Werewolves",
                "An Italian Dessert"
        );
        QuestionGenerator.createQuestion(29,"When you want to discuss something “Offline” you want to",
                "Talk in private",
                "Have Skype call",
                "Meet over drinks",
                "Understand the Offside rule in football"
        );
        QuestionGenerator.createQuestion(30,
                "When you think “Outside the box” you",
                "Come up with a new idea",
                "Walk out of the cubicle",
                "Cook instead of ordering takeaway",
                "Draw a circle on the floor"
        );
        QuestionGenerator.createQuestion(31,"A “Paradigm Shift” is used to talk about",
                "A significant change",
                "A geological phenomenon",
                "The theory of evolution",
                "A late shift at work"
        );
        QuestionGenerator.createQuestion(32, "If someone gave you a “Roadmap” they gave you ",
                "A Strategy",
                "A Michelin Guide",
                "An Atlas",
                "A Tourist Book"
        );
        QuestionGenerator.createQuestion(33,

                "A “Zero-Sum Game” is ",
                "A winner takes all situation",
                "When everyone scores a duck",
                "A sudoku game gone wrong",
                "A mathematics quiz"
        );
        QuestionGenerator.createQuestion(34,"The phrase “With all due respect” is normally followed by a",
                "A Disagreement",
                "Word of praise",
                "Hearty Felicitations",
                "A Grin and a Wink"
        );
        QuestionGenerator.createQuestion(35,
                "When both parties of a partnership succeed it can be a",
                "Win-win",
                "Tintin",
                "Ying-yang",
                "Kingpin"
        );


        QuestionGenerator.createQuestion(36,"If you contribute a valid point during a meeting you have",
                "Value added",
                "Made friends",
                "Touched base",
                "Roadmap-ed"
        );
        QuestionGenerator.createQuestion(37, "Who can be referred to as a “Thought Leader”?",
                "A Revolutionary Thinker",
                "A Powerful Telepath",
                "A Delusional Dictator",
                "A Day Dreamer"
        );
        QuestionGenerator.createQuestion(38,

                "If you and your colleague are “On the Same Page”",
                "You agree with each other",
                "You haven’t moved an inch",
                "You are discussing a great book",
                "You are fighting for the photocopier"
        );
        QuestionGenerator.createQuestion(39,"What can also mean “move something to an earlier time”?",
                "Prepone",
                "Postpone",
                "Earphone",
                "Gladstone"
        );
        QuestionGenerator.createQuestion(40,
                "When you have a really “Successful Partnership” you have great",
                "Synergy",
                "Trilogy",
                "Lethargy",
                "Misery"
        );
        QuestionGenerator.createQuestion(41,"When you make contact with a client you have",
                "Touched base",
                "Dialed in",
                "Hit Gold",
                "Zoomed out"
        );
        QuestionGenerator.createQuestion(42, "What do you do when you “Reinvent the wheel”?",
                "Recreate something that already exists",
                "Take a lesson on the prehistoric age",
                "Come up with a revolutionary idea",
                "Learn the ropes from an expert"
        );
        QuestionGenerator.createQuestion(43,"While most people “reply” to mails what do Corporate executives do?","Revert",
                "Reverberate",
                "Rejuvenate",
                "Regret"
        );
        QuestionGenerator.createQuestion(44, "If you have “Checked Every Box” you have",
                "Completed every task",
                "Become A Packing Agent",
                "A compulsive disorder",
                "Started a Security agency"
        );
        QuestionGenerator.createQuestion(45,

                "A “Powerpoint Presentation” can be called a",
                "Deck",
                "Duck",
                "Dunk",
                "Donut"
        );
        QuestionGenerator.createQuestion(46,"What kind of technology is called “Disruptive”? ",
                "A revolutionary one",
                "An annoying one",
                "A redundant one",
                "An incomprehensible one"
        );

        QuestionGenerator.createQuestion(47,"What is a “Benchmark”?","An acceptable standard",
                "A brand of office furniture",
                "A stain in a classroom",
                "A leveraged initiative"

        );
        QuestionGenerator.createQuestion(48,
                "When your HR decides to “Right Size” they want to",
                "Fire some employees",
                "Hire fresh talent",
                "Call a Fashion Designer",
                "Adjust their screen resolution"
        );

        QuestionGenerator.createQuestion(49, "What can be called a “Resource”?",
                "Just about anything",
                "Employee",
                "Stationery",
                "Money"
        );
        QuestionGenerator.createQuestion(50,

                "A “Contingency Plan” is a plan that can be a",
                "Back up",
                "Benchmark",
                "Paradigm",
                "Incentive"
        );
        QuestionGenerator.createQuestion(51,"An “Appraisal Discussion” stands for",
                "A performance evaluation",
                "A conference of revolutionaries",
                "A contingency planning",
                " A cross functional training"
        );
        QuestionGenerator.createQuestion(52,
                "If you ask your boss for a “Hike” you expect him to",
                "Increase your salary",
                "Drop you home",
                "Ideate with you",
                "Empathize with you"
        );

        QuestionGenerator.createQuestion(53,"The “Corner room” refers to ","The CEO's room",
                "The Conference room",
                "The Toilet",
                "The Canteen"
        );

        QuestionGenerator.createQuestion(54,

                "When you keep someone “In the Loop” you",
                "Keep then informed",
                "Impart piloting lessons",
                "Teach them skating",
                "Benchmark their skillset"
        );
        QuestionGenerator.createQuestion(55, "What is a “Skill Set”?",
                "Someone's talents",
                "A hobby centre",
                "A pack of cards",
                "A positioning matrix"
        );
        QuestionGenerator.createQuestion(56,"What is a “Ballpark” figure?",
                "A rough estimate",
                "The Ramanujam number",
                "The age of the universe",
                "Sachin's batting average"
        );
        QuestionGenerator.createQuestion(57,
                "When you are asked to “Do the Needful” you are expected to",
                "Do everything",
                "Do nothing",
                " Do a little bit",
                " Do just what's needed"
        );


        QuestionGenerator.createQuestion(58,"When you “Maximize Impact” you","Give great results",
                "Hit someone really hard",
                "Concall on takeaways",
                "Launch a missile"
        );
        QuestionGenerator.createQuestion(59, "What can be a “Best Practice”?",
                "A replicable idea",
                "An early morning jog",
                "A Ballpark figure",
                "An 800 pound gorilla"
        );
        QuestionGenerator.createQuestion(60,

                "When you “Engage” with a client you",
                "Speak to each other",
                "Ask him/her to marry you",
                "Hire them",
                "Rightsize the insight"
        );
        QuestionGenerator.createQuestion(61,"An “Insight” could refer to a ",
                "A Learning",
                "A Visionary Skill Set",
                "An Offline meeting",
                "An Appraisal Discussion"
        );
        QuestionGenerator.createQuestion(62,
                "When your boss says “On a lighter note...” you",
                "Smile no matter what",
                "Whistle a Beatles tune",
                "Talk about the weather",
                "Strike a match for him"
        );

        QuestionGenerator.createQuestion(63,"What is a “Key Deliverable”?","An important result",
                "An important package",
                "A con call technique",
                "A robotic codebreaker"
        );
        QuestionGenerator.createQuestion(64, "What could be a “Holistic Approach”?",
                "A well thought plan",
                "A cult ritual",
                "A quick revert",
                "A lurking python"
        );
        QuestionGenerator.createQuestion(65,

                "When you “Challenge the Status Quo” you",
                "Question something",
                "Brush up on your latin",
                "Implement Deliverables",
                "Insight restrictively"
        );
        QuestionGenerator.createQuestion(66,"At the end of a “Gardening Leave” you are likely to ",
                "Join competition",
                "Have a Green Thumb",
                "Have a Suntan",
                "Join the Ladies Club"
        );
        QuestionGenerator.createQuestion(67,
                "A “Value Proposition” is a/an ",
                "Attractive feature",
                "Sales call",
                "Book on ethics",
                "A sermon"
        );
    }

}
