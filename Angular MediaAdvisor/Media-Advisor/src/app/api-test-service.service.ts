import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';

import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class ApiTestServiceService {

  constructor(private http: HttpClient) { }

  private usersUrl = 'http://localhost:8095/rest/user/all';  // URL to web api

  /** Log a HeroService message with the MessageService */
  private log(message: string) {
    console.log('meh');
  }

  getUsers(): Observable<Users[]> {
    return this.http.get<Users[]>(this.usersUrl)
    .pipe(
      tap(_ => this.log('fetched heroes')),
      catchError(this.handleError('getHeroes', []))
    );
  }
  /**
 * Handle Http operation that failed.
 * Let the app continue.
 * @param operation - name of the operation that failed
 * @param result - optional value to return as the observable result
 */
private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
