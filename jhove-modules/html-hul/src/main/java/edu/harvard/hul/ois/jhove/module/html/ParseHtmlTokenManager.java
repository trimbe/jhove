/* Generated By:JavaCC: Do not edit this line. ParseHtmlTokenManager.java */
package edu.harvard.hul.ois.jhove.module.html;
//import java.util.*;

public class ParseHtmlTokenManager implements ParseHtmlConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjMoveStringLiteralDfa0_7()
{
   switch(curChar)
   {
      case 62:
         return jjStopAtPos(0, 25);
      default :
         return jjMoveNfa_7(0, 0);
   }
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_7(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xbfffffffffffffffL & l) != 0L)
                     kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 26)
                     kind = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final static int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 60:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x400002L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 33:
         if ((active0 & 0x2L) != 0L)
         {
            jjmatchedKind = 1;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(3, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xeffffffeffffc9ffL & l) != 0L)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 3)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_4()
{
   switch(curChar)
   {
      case 47:
         return jjStopAtPos(0, 11);
      case 58:
         return jjStopAtPos(0, 12);
      case 63:
         return jjStopAtPos(0, 10);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_4(0x4000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_4(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_4(active0, 0x4000L);
      default :
         return 2;
   }
}
private final int jjMoveStringLiteralDfa2_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_4(active0, 0x4000L);
      default :
         return 3;
   }
}
private final int jjMoveStringLiteralDfa3_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_4(active0, 0x4000L);
      default :
         return 4;
   }
}
private final int jjMoveStringLiteralDfa4_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 89:
      case 121:
         return jjMoveStringLiteralDfa5_4(active0, 0x4000L);
      default :
         return 5;
   }
}
private final int jjMoveStringLiteralDfa5_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 80:
      case 112:
         return jjMoveStringLiteralDfa6_4(active0, 0x4000L);
      default :
         return 6;
   }
}
private final int jjMoveStringLiteralDfa6_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(6, 14);
         break;
      default :
         return 7;
   }
   return 7;
}
private final static int jjStopStringLiteralDfa_5(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_5(int pos, long active0)
{
   return jjMoveNfa_5(jjStopStringLiteralDfa_5(pos, active0), pos + 1);
}
private final int jjStartNfaWithStates_5(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_5(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_5()
{
   switch(curChar)
   {
      case 62:
         return jjStopAtPos(0, 13);
      default :
         return jjMoveNfa_5(1, 0);
   }
}
private final int jjMoveNfa_5(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0xbffffffaffffc9ffL & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 0:
                  if ((0xbffffffaffffc9ffL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0xfffffffbffffcbffL & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 34 && kind > 16)
                     kind = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_3()
{
   return jjMoveNfa_3(1, 0);
}
private final int jjMoveNfa_3(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x9fffeffaffffc9ffL & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(2, 3);
                  if (curChar == 39)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 0:
                  if ((0x9fffeffaffffc9ffL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 34 && kind > 8)
                     kind = 8;
                  break;
               case 4:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 5:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 39 && kind > 9)
                     kind = 9;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  jjAddStates(0, 1);
                  break;
               case 5:
                  jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private final int jjMoveNfa_1(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xefffffffffffffffL & l) == 0L)
                     break;
                  kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_6()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_6(0x800000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_6(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjStopStringLiteralDfa_2(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_2(int pos, long active0)
{
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
private final int jjStartNfaWithStates_2(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_2(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 47:
         return jjStopAtPos(0, 11);
      case 58:
         return jjStopAtPos(0, 12);
      case 62:
         return jjStopAtPos(0, 13);
      case 63:
         return jjStopAtPos(0, 10);
      default :
         return jjMoveNfa_2(0, 0);
   }
}
private final int jjMoveNfa_2(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int j;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar != 61)
                     break;
                  kind = 6;
                  jjCheckNAdd(3);
                  break;
               case 1:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  kind = 5;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if ((0x100002400L & l) == 0L)
                     break;
                  kind = 6;
                  jjCheckNAdd(3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 5, 6,
};
public static final String[] jjstrLiteralImages = {
"", "\74\41", "\74", null, null, null, null, null, null, null, "\77", "\57", 
"\72", "\76", null, null, null, null, null, null, null, null, null, null, null, null,
null, };
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_PCDATA",
   "IN_TAG",
   "IN_ATTVALUE",
   "IN_DOCTYPE",
   "IN_DOCTYPE2",
   "IN_COMMENT",
   "ENDING_COMMENT",
};
public static final int[] jjnewLexState = {
   -1, 4, 2, 1, 0, -1, 3, 2, 2, 2, -1, -1, -1, 0, 5, -1, -1, -1, -1, -1, -1, -1, 6, 7, -1,
   0, 6,
};
static final long[] jjtoToken = {
   0x1fff7L,
};
static final long[] jjtoSkip = {
   0x6be0000L,
};
static final long[] jjtoSpecial = {
   0x6800000L,
};
static final long[] jjtoMore = {
   0x1400008L,
};
protected CharStream input_stream;
private final int[] jjrounds = new int[7];
private final int[] jjstateSet = new int[14];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
public ParseHtmlTokenManager(CharStream stream)
{
   input_stream = stream;
}
public ParseHtmlTokenManager(CharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 8 || lexState < 0)
      throw new TokenMgrError(MessageConstants.HTML_HUL_21.getMessage() + lexState, TokenMgrError.INVALID_LEXICAL_STATE);
   curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         t.image = "";
      else
         t.image = image.toString();
      t.beginLine = t.endLine = input_stream.getBeginLine();
      t.beginColumn = t.endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      t.image = (im == null) ? input_stream.GetImage() : im;
      t.beginLine = input_stream.getBeginLine();
      t.beginColumn = input_stream.getBeginColumn();
      t.endLine = input_stream.getEndLine();
      t.endColumn = input_stream.getEndColumn();
   }
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken()
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 4;
         jjmatchedPos = -1;
         curPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
       case 2:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         break;
       case 4:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_4();
         break;
       case 5:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_5();
         break;
       case 6:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_6();
         if (jjmatchedPos == 0 && jjmatchedKind > 24)
         {
            jjmatchedKind = 24;
         }
         break;
       case 7:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_7();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
}
