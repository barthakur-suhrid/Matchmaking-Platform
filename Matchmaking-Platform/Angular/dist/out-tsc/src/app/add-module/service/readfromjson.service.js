var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
var httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    })
};
var ReadfromjsonService = /** @class */ (function () {
    function ReadfromjsonService(httpClient) {
        this.httpClient = httpClient;
    }
    ReadfromjsonService.prototype.readFromJson = function (json_url) {
        return this.httpClient.get(json_url, httpOptions).pipe(catchError(this.errorHandler));
    };
    ReadfromjsonService.prototype.errorHandler = function (error) {
        if (error.error instanceof ErrorEvent) {
            // A client-side or network error occurred. Handle it accordingly.
            console.error('An error occurred:', error.error.message);
        }
        else {
            console.error("Backend returned code " + error.status + ", " +
                ("body was: " + error.error));
        }
        // return an observable with a user-facing error message
        return throwError('Something bad happened; please try again later.');
    };
    ReadfromjsonService = __decorate([
        Injectable({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [HttpClient])
    ], ReadfromjsonService);
    return ReadfromjsonService;
}());
export { ReadfromjsonService };
//# sourceMappingURL=readfromjson.service.js.map